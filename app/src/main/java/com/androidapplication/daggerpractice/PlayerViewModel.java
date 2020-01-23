package com.androidapplication.daggerpractice;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import javax.inject.Inject;

public class PlayerViewModel extends ViewModel {

    private MutableLiveData<Player> playerMutableLiveData = new MutableLiveData<>();
    private Player player;
    private PlayerRepository playerRepository;

    @Inject
    public PlayerViewModel(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
        player = new Player("tk","kt");
        playerRepository = new PlayerRepository(player);
        playerMutableLiveData = playerRepository.getPlayerMutableLiveData();
    }

    public MutableLiveData<Player> getPlayerMutableLiveData() {
        return playerMutableLiveData;
    }


}
