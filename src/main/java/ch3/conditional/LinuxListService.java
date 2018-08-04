package ch3.conditional;
//linux下要创建的bean类
public class LinuxListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
