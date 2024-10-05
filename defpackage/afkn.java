package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class afkn extends Observable implements amnv {
    private final ArrayList a = new ArrayList();

    @Override // java.util.Observable
    public final synchronized void addObserver(Observer observer) {
        afki.a(observer);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            Observer observer2 = (Observer) ((WeakReference) it.next()).get();
            if (observer2 == null) {
                it.remove();
            } else if (observer2.equals(observer)) {
                return;
            }
        }
        this.a.add(new WeakReference(observer));
    }

    @Override // java.util.Observable
    public final synchronized int countObservers() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == null) {
                it.remove();
            }
        }
        return this.a.size();
    }

    @Override // java.util.Observable
    public final synchronized void deleteObserver(Observer observer) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            Observer observer2 = (Observer) ((WeakReference) it.next()).get();
            if (observer2 == null) {
                it.remove();
            } else if (observer2.equals(observer)) {
                it.remove();
                return;
            }
        }
    }

    @Override // java.util.Observable
    public final synchronized void deleteObservers() {
        this.a.clear();
    }

    @Override // java.util.Observable
    public final void notifyObservers(Object obj) {
        ArrayList arrayList = new ArrayList(this.a.size());
        synchronized (this) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                Observer observer = (Observer) ((WeakReference) it.next()).get();
                if (observer == null) {
                    it.remove();
                } else {
                    arrayList.add(observer);
                }
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Observer) arrayList.get(i)).update(this, obj);
        }
    }
}
