package com.example.roomwords_sample;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class WordViewModel extends AndroidViewModel {

    private WordRepository mRepository;
    private LiveData<List<Word>> mAllWords;

    public WordViewModel(@NonNull Application application) {
        super(application);
        mRepository = new WordRepository(application);
        mAllWords = mRepository.getAllWords();
    }

    LiveData<List<Word>> getAllWords() {
        return mAllWords;
    }

    void deleteAll() {
        mRepository.deleteAllWords();
    }

    void deleteWord(Word word) {
        mRepository.deleteWord(word);
    }

    public void insert(Word word) {
        mRepository.insert(word);
    }
}
