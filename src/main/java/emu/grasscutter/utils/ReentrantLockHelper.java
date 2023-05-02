package emu.grasscutter.utils;

import lombok.Getter;

import java.util.concurrent.locks.Lock;

@Getter
public class ReentrantLockHelper implements AutoCloseable {

    private Lock lock;


    public ReentrantLockHelper(Lock lock) {
        this.lock = lock;
        this.lock.lock();
    }

    @Override
    public void close() {
        this.lock.unlock();
    }

}
