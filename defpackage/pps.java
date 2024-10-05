package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pps implements ppx {
    private int c;
    private boolean d;
    private final ppz b = new ppz();
    public final Deque a = new ArrayDeque();

    public pps() {
        for (int i = 0; i < 2; i++) {
            this.a.addFirst(new ppv(new asx() { // from class: ppq
                @Override // defpackage.asx
                public final void a(asy asyVar) {
                    pps ppsVar = pps.this;
                    pqa pqaVar = (pqa) asyVar;
                    pse.g(ppsVar.a.size() < 2);
                    pse.e(!ppsVar.a.contains(pqaVar));
                    pqaVar.clear();
                    ppsVar.a.addFirst(pqaVar);
                }
            }));
        }
        this.c = 0;
    }

    @Override // defpackage.ast
    public final /* bridge */ /* synthetic */ Object a() {
        pse.g(!this.d);
        if (this.c != 0) {
            return null;
        }
        this.c = 1;
        return this.b;
    }

    @Override // defpackage.ast
    public final /* bridge */ /* synthetic */ Object b() {
        pse.g(!this.d);
        if (this.c != 2 || this.a.isEmpty()) {
            return null;
        }
        pqa pqaVar = (pqa) this.a.removeFirst();
        if (this.b.isEndOfStream()) {
            pqaVar.addFlag(4);
        } else {
            ppz ppzVar = this.b;
            long j = ppzVar.d;
            ByteBuffer byteBuffer = ppzVar.b;
            pse.c(byteBuffer);
            byte[] array = byteBuffer.array();
            Parcel obtain = Parcel.obtain();
            obtain.unmarshall(array, 0, array.length);
            obtain.setDataPosition(0);
            Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
            obtain.recycle();
            ArrayList parcelableArrayList = readBundle.getParcelableArrayList("c");
            pse.c(parcelableArrayList);
            pqaVar.e(this.b.d, new ppr(j, pse.b(ppp.b, parcelableArrayList)), 0L);
        }
        this.b.clear();
        this.c = 0;
        return pqaVar;
    }

    @Override // defpackage.ast
    public final String c() {
        throw null;
    }

    @Override // defpackage.ast
    public final void d() {
        pse.g(!this.d);
        this.b.clear();
        this.c = 0;
    }

    @Override // defpackage.ast
    public final /* bridge */ /* synthetic */ void e(Object obj) {
        ppz ppzVar = (ppz) obj;
        pse.g(!this.d);
        pse.g(this.c == 1);
        pse.e(this.b == ppzVar);
        this.c = 2;
    }

    @Override // defpackage.ast
    public final void f() {
        this.d = true;
    }

    @Override // defpackage.ppx
    public final void w(long j) {
    }
}
