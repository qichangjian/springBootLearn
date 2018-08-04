package ch3.conditional;
//Windows下要创建的bean类
public class WindowsListService implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
