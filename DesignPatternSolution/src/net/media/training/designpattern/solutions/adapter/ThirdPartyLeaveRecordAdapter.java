package net.media.training.designpattern.solutions.adapter;

import net.media.training.designpattern.solutions.adapter.thirdparty.ThirdPartyLeaveRecord;

public class ThirdPartyLeaveRecordAdapter implements LeaveRecord{
    ThirdPartyLeaveRecord thirdPartyLeaveRecord;
    ThirdPartyLeaveRecordAdapter(ThirdPartyLeaveRecord thirdPartyLeaveRecord){
        this.thirdPartyLeaveRecord = thirdPartyLeaveRecord;
    }
    public String getMostAbsentEmployee() {
        return thirdPartyLeaveRecord.getMostAbsentEmployee().getName();
    }

    public int getEmployeeAbsences(String employeeName) {
//        Employee employee = thirdPartyLeaveRecord.getEmployeeByname(employeeName);
        return 0;
    }
}
