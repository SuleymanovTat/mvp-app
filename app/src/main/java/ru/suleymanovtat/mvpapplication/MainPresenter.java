package ru.suleymanovtat.mvpapplication;

import java.util.List;

/**
 * Created by suleymanovtat on 27.02.2018.
 */

public class MainPresenter implements IMainPresenter {

    private IView view;
    private IModel model;

    public MainPresenter(IView view) {
        this.view = view;
        model = new Model();
    }

    @Override
    public void onGetButtonClick() {
        if (view.getUrl().isEmpty()) {
            view.showError();
        } else {
            List<Object> list = model.getRssFeed(view.getUrl());
            if (list != null) {
                view.showData();
            } else {
                view.showError();
            }
        }
    }
}
