package designPattern.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MenuHouse {

    private List<Menu> menuList = new ArrayList<>();

    public void addMenu(Menu menu) {
        menuList.add(menu);
    }


    public Iterator<Menu> iterator() {
        return new MenuIterator<>();
    }

    // TODO zhaoziqiang 2019-04-05 看下ArrayList的iterator实现，especially remove方法
    private class MenuIterator<Menu> implements Iterator<designPattern.iterator.Menu> {

        int cursor = 0;

        @Override
        public boolean hasNext() {
            if (Objects.isNull(menuList) || menuList.isEmpty()) {
                return false;
            }
            return cursor < menuList.size();
        }

        @Override
        public designPattern.iterator.Menu next() {
            if (!hasNext()) {
                throw new RuntimeException();
            }
            return menuList.get(cursor ++);
        }
    }
}
