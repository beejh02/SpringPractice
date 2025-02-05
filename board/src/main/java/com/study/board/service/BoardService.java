package com.study.board.service;

import org.springframework.stereotype.Service;

import com.study.board.entity.Board;
import com.study.board.repository.BoardRepository;

@Service
public class BoardService {

    private final BoardRepository boardRepository;
    
    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public void write(Board board) {
        boardRepository.save(board);
    }

}
