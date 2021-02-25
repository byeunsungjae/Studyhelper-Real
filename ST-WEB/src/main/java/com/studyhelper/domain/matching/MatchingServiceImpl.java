package com.studyhelper.domain.matching;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.studyhelper.domain.entity.Matching;
import com.studyhelper.domain.entity.Member;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MatchingServiceImpl implements MatchingService{
	private final MatchingRepository matchingRepository;
	
	@Override
	@Transactional
	public void saveMatching(Member member,Matching matching) {
		matching.setMemberId(member.getId());
		
		matchingRepository.save(matching);
	}

}
