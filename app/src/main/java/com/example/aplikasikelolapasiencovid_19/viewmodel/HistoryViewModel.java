package com.example.aplikasikelolapasiencovid_19.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.aplikasikelolapasiencovid_19.model.Pasien;
import com.example.aplikasikelolapasiencovid_19.repository.Repository;

import java.util.List;

public class HistoryViewModel extends AndroidViewModel {

    private Repository repository;

    public int listSize = 0;

    public LiveData<List<Pasien>> getAllPasien(){
        return repository.getAllPasien();
    }

    public HistoryViewModel(@NonNull Application application) {
        super(application);
        repository = new Repository(application);
    }

    public void insertPasien(Pasien pasien){
        repository.insertPasien(pasien);
    }

    public void deletePasien(Pasien pasien){
        repository.deletePasien(pasien);
    }

    public void updatePasien(Pasien pasien) {
        repository.updatePasien(pasien);
    }
}
