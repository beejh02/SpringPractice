package com.leejoonheyok.board.controller;

import com.leejoonheyok.board.model.Board;
import com.leejoonheyok.board.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {
    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/board")
    public String showBoard(Model model) {
        Board board = new Board();
        board.setTitle("게시판 제목");
        model.addAttribute("board", board);
        return "index";
    }

    @PostMapping("/boards")
    public String create(Board board) {
        boardService.save(board);
        return "redirect:/";
    }
}