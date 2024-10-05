package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rkz extends aonm implements aooz {
    private static final rkz a;
    private static volatile aopf b;
    private int c;
    private aony d = emptyProtobufList();
    private String e = "";
    private long f;
    private long g;
    private int h;

    static {
        rkz rkzVar = new rkz();
        a = rkzVar;
        aonm.registerDefaultInstance(rkz.class, rkzVar);
    }

    private rkz() {
    }

    public void A(int i, rlb rlbVar) {
        rlbVar.getClass();
        x();
        this.d.set(i, rlbVar);
    }

    public void B(long j) {
        this.c |= 4;
        this.g = j;
    }

    public void C(long j) {
        this.c |= 2;
        this.f = j;
    }

    public static rky e() {
        return (rky) a.createBuilder();
    }

    public static /* synthetic */ rkz f() {
        return a;
    }

    public static /* synthetic */ void j(rkz rkzVar, int i, rlb rlbVar) {
        rkzVar.A(i, rlbVar);
    }

    public static /* synthetic */ void k(rkz rkzVar, rlb rlbVar) {
        rkzVar.v(rlbVar);
    }

    public static /* synthetic */ void n(rkz rkzVar, int i) {
        rkzVar.y(i);
    }

    public void u(Iterable iterable) {
        x();
        aolo.addAll(iterable, (List) this.d);
    }

    public void v(rlb rlbVar) {
        rlbVar.getClass();
        x();
        this.d.add(rlbVar);
    }

    public void w() {
        this.d = emptyProtobufList();
    }

    private void x() {
        aony aonyVar = this.d;
        if (aonyVar.c()) {
            return;
        }
        this.d = aonm.mutableCopy(aonyVar);
    }

    public void y(int i) {
        x();
        this.d.remove(i);
    }

    public void z(String str) {
        str.getClass();
        this.c |= 1;
        this.e = str;
    }

    public int a() {
        return this.h;
    }

    public int b() {
        return this.d.size();
    }

    public long c() {
        return this.g;
    }

    public long d() {
        return this.f;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"c", "d", rlb.class, "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new rkz();
            case NEW_BUILDER:
                return new rky();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (rkz.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public rlb g(int i) {
        return (rlb) this.d.get(i);
    }

    public String h() {
        return this.e;
    }

    public List i() {
        return this.d;
    }

    public boolean r() {
        return (this.c & 8) != 0;
    }

    public boolean s() {
        return (this.c & 4) != 0;
    }

    public boolean t() {
        return (this.c & 2) != 0;
    }
}
