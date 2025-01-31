package com.mjc.school.controller.commands;

import com.mjc.school.controller.Command;
import com.mjc.school.controller.implementation.AuthorController;

public class GetAuthorByNewsIdCommand implements Command {

    private final AuthorController authorController;
    private final Long id;

    public GetAuthorByNewsIdCommand(AuthorController authorController, Long id) {
        this.authorController = authorController;
        this.id = id;
    }

    @Override
    public Object execute() {
        return authorController.getAuthorByNewsId(id);
    }
}