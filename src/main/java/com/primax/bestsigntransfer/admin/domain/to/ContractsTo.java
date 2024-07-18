package com.primax.bestsigntransfer.admin.domain.to;

import lombok.Data;

import java.util.List;

@Data
public class ContractsTo {

    private String templateId;

    private String sendAction;

    private List<Role> roles;
    private class Role{
        private String roleId;
        private UserInfo userInfo;
        private class UserInfo{
            private String userAccount;
            private String enterpriseName;
            private String userName;
        }
    }

    private Sender sender;
    private class Sender{
        private String enterpriseName;
        private String account;
        private String bizName;
    }

    private List<TextLabel> textLabels;
    private class TextLabel{
        private String name;
        private String value;
    }

}
