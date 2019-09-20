package com.io.zhach.proj_temperature_forecast.viewModel;

import android.app.Application;

import com.io.zhach.proj_temperature_forecast.Model.User;
import com.io.zhach.proj_temperature_forecast.database.UserRepository;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

public class UserViewModel extends AndroidViewModel {
    private UserRepository repository;
    private LiveData<List<User>> allUsers;

    public UserViewModel(@NonNull Application application) {
        super(application);
        repository = new UserRepository(application);
        allUsers = repository.getAllUsers();
    }

    public void insert(User user) {
        repository.insert(user);
    }

    public void update(User user) {
        repository.update(user);
    }

    public void delete(User user) {
        repository.delete(user);
    }

    public void deleteAllNotes() {
        repository.deleteAllUsers();
    }

    public LiveData<List<User>> getAllNotes() {
        return allUsers;
    }
}
