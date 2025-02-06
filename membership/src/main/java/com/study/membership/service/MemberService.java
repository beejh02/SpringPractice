package com.study.membership.service;

import org.springframework.stereotype.Service;

import com.study.membership.dto.MemberDTO;
import com.study.membership.entity.MemberEntity;
import com.study.membership.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public void save(MemberDTO memberDTO) {

        MemberEntity memberEntity = MemberEntity.toMemberEntity(memberDTO);
        memberRepository.save(memberEntity);

    }
    
}
