package androidx.window.java.layout;

import androidx.window.layout.WindowInfoRepository;
import defpackage.aype;
import defpackage.azsf;
import defpackage.azsv;
import defpackage.azsw;
import defpackage.azta;
import defpackage.azwh;
import defpackage.azwu;
import defpackage.azxc;
import defpackage.azxg;
import defpackage.azxj;
import defpackage.azxv;
import defpackage.azyy;
import defpackage.azzl;
import defpackage.azzn;
import defpackage.hw;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class WindowInfoRepositoryCallbackAdapter implements WindowInfoRepository {
    private final Map consumerToJobMap;
    private final ReentrantLock lock;
    private final WindowInfoRepository repository;

    public WindowInfoRepositoryCallbackAdapter(WindowInfoRepository windowInfoRepository) {
        windowInfoRepository.getClass();
        this.repository = windowInfoRepository;
        this.lock = new ReentrantLock();
        this.consumerToJobMap = new LinkedHashMap();
    }

    private final void addListener(Executor executor, hw hwVar, azyy azyyVar) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.consumerToJobMap.get(hwVar) == null) {
                executor.getClass();
                azsv azxcVar = (executor instanceof azwu ? (azwu) executor : null) == null ? new azxc(executor) : null;
                azxcVar.getClass();
                if (azxcVar.get(azxg.b) == null) {
                    azxcVar = azxcVar.plus(new azxj());
                }
                azzl azzlVar = new azzl(azxcVar);
                Map map = this.consumerToJobMap;
                WindowInfoRepositoryCallbackAdapter$addListener$1$1 windowInfoRepositoryCallbackAdapter$addListener$1$1 = new WindowInfoRepositoryCallbackAdapter$addListener$1$1(azyyVar, hwVar, null);
                azxv azxvVar = new azxv(azwh.b(azzlVar, azsw.a));
                try {
                    azzn.a(((azta) windowInfoRepositoryCallbackAdapter$addListener$1$1.create(azxvVar, azxvVar)).intercepted(), azsf.a);
                    map.put(hwVar, azxvVar);
                } catch (Throwable th) {
                    azxvVar.resumeWith(aype.l(th));
                    throw th;
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    private final void removeListener(hw hwVar) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            azxg azxgVar = (azxg) this.consumerToJobMap.get(hwVar);
            if (azxgVar != null) {
                azxgVar.k(null);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void addCurrentWindowMetricsListener(Executor executor, hw hwVar) {
        executor.getClass();
        hwVar.getClass();
        addListener(executor, hwVar, this.repository.getCurrentWindowMetrics());
    }

    public final void addWindowLayoutInfoListener(Executor executor, hw hwVar) {
        executor.getClass();
        hwVar.getClass();
        addListener(executor, hwVar, this.repository.getWindowLayoutInfo());
    }

    @Override // androidx.window.layout.WindowInfoRepository
    public azyy getCurrentWindowMetrics() {
        return this.repository.getCurrentWindowMetrics();
    }

    @Override // androidx.window.layout.WindowInfoRepository
    public azyy getWindowLayoutInfo() {
        return this.repository.getWindowLayoutInfo();
    }

    public final void removeCurrentWindowMetricsListener(hw hwVar) {
        hwVar.getClass();
        removeListener(hwVar);
    }

    public final void removeWindowLayoutInfoListener(hw hwVar) {
        hwVar.getClass();
        removeListener(hwVar);
    }
}
