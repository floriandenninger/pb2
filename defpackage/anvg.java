package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anvg extends anug {
    public final Set a;
    public final anuk b;
    private final Set c;
    private final Set d;

    public anvg(anuj anujVar, anuk anukVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (anuu anuuVar : anujVar.b) {
            if (!anuuVar.d()) {
                if (!anuuVar.e()) {
                    hashSet2.add(anuuVar.a);
                } else {
                    hashSet5.add(anuuVar.a);
                }
            } else if (!anuuVar.e()) {
                hashSet.add(anuuVar.a);
            } else {
                hashSet4.add(anuuVar.a);
            }
        }
        if (!anujVar.e.isEmpty()) {
            hashSet.add(anwc.class);
        }
        this.c = Collections.unmodifiableSet(hashSet);
        this.d = Collections.unmodifiableSet(hashSet2);
        Collections.unmodifiableSet(hashSet3);
        this.a = Collections.unmodifiableSet(hashSet4);
        Collections.unmodifiableSet(hashSet5);
        Set set = anujVar.e;
        this.b = anukVar;
    }

    @Override // defpackage.anug, defpackage.anuk
    public final Object a(Class cls) {
        if (!this.c.contains(cls)) {
            throw new anuw(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        Object a = this.b.a(cls);
        if (!cls.equals(anwc.class)) {
            return a;
        }
        return new anvf();
    }

    @Override // defpackage.anuk
    public final anwy b(Class cls) {
        if (!this.d.contains(cls)) {
            throw new anuw(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
        }
        return this.b.b(cls);
    }

    @Override // defpackage.anuk
    public final anwy c(Class cls) {
        throw null;
    }
}
