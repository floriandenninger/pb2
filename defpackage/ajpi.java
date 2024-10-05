package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajpi {
    private final ReadWriteLock a = new ReentrantReadWriteLock();
    private final Map b = new HashMap();
    private azrw c;

    public final ajph a(Object obj) {
        this.a.readLock().lock();
        azrw azrwVar = (azrw) this.b.get(obj);
        if (azrwVar == null) {
            azrwVar = this.c;
        }
        this.a.readLock().unlock();
        if (azrwVar != null) {
            return (ajph) azrwVar.get();
        }
        return null;
    }

    public final void b(Map map) {
        this.a.readLock().lock();
        try {
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                amkq.N(!this.b.containsKey(it.next()));
            }
            this.a.readLock().unlock();
            this.a.writeLock().lock();
            this.b.putAll(map);
            this.a.writeLock().unlock();
        } catch (Throwable th) {
            this.a.readLock().unlock();
            throw th;
        }
    }

    public final void c(azrw azrwVar) {
        this.a.writeLock().lock();
        this.c = azrwVar;
        this.a.writeLock().unlock();
    }
}
