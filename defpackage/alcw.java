package defpackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alcw {
    public final akyb a;
    private final akwm c;
    private final zey d;
    public final Set b = new CopyOnWriteArraySet();
    private boolean g = false;
    private final yqb e = new yqb() { // from class: alcv
        @Override // defpackage.yqb
        public final void a() {
            alcw alcwVar = alcw.this;
            alcwVar.a(alcwVar.a, avto.UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_MOVED_APP_TO_FOREGROUND, alcwVar.b);
        }
    };
    private final yqa f = new yqa() { // from class: alcu
        @Override // defpackage.yqa
        public final void c() {
            alcw alcwVar = alcw.this;
            alcwVar.a(alcwVar.a, avto.UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_MOVED_APP_TO_BACKGROUND, alcwVar.b);
        }
    };

    public alcw(akwm akwmVar, akyb akybVar, zey zeyVar) {
        this.c = akwmVar;
        this.a = akybVar;
        this.d = zeyVar;
    }

    public final void a(akyb akybVar, avto avtoVar, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                akzs b = this.c.b(str);
                if (b != null) {
                    akybVar.d(str, b.e, avtoVar);
                }
            } catch (akwn unused) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    "JobStorageException for job ".concat(valueOf);
                }
            }
        }
    }

    public final synchronized void b(String str) {
        this.b.add(str);
        if (this.g) {
            return;
        }
        this.d.a(this.e);
        this.d.a(this.f);
        this.g = true;
    }

    public final synchronized void c(String str) {
        this.b.remove(str);
        if (this.b.isEmpty() && this.g) {
            this.d.b(this.e);
            this.d.b(this.f);
            this.g = false;
        }
    }
}
