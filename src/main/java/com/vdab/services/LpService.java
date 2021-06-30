package com.vdab.services;

import com.vdab.domain.Lp;
import com.vdab.repositories.LpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LpService {

    @Autowired
    private LpRepository lpRepository;

    public List<Lp> getLps() {
        return lpRepository.getLps();
    }

    public void saveLp(Lp newLp) {
        lpRepository.saveLp(newLp);
    }

    public Lp findLpById(long id) {
        return lpRepository.findLpById(id);
    }

    public void updateLp(Lp lp) {
        lpRepository.updateLp(lp);
    }

    public void deleteLp(long id) {
        lpRepository.deleteLp(id);
    }
}
