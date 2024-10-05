package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoff extends aonm implements aooz {
    private static final aoff a;
    private static volatile aopf b;
    private int c;
    private int d = 0;
    private Object e;
    private long f;
    private aofd g;
    private long h;

    static {
        aoff aoffVar = new aoff();
        a = aoffVar;
        aonm.registerDefaultInstance(aoff.class, aoffVar);
    }

    private aoff() {
    }

    public static aofe c() {
        return (aofe) a.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(long j) {
        this.c |= 128;
        this.h = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(aofd aofdVar) {
        aofdVar.getClass();
        this.g = aofdVar;
        this.c |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(aofg aofgVar) {
        aofgVar.getClass();
        this.e = aofgVar;
        this.d = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(long j) {
        this.c |= 32;
        this.f = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(aofl aoflVar) {
        aoflVar.getClass();
        this.e = aoflVar;
        this.d = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(aofm aofmVar) {
        aofmVar.getClass();
        this.e = aofmVar;
        this.d = 1;
    }

    public long a() {
        return this.f;
    }

    public aofd b() {
        aofd aofdVar = this.g;
        return aofdVar == null ? aofd.a : aofdVar;
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
                return newMessageInfo(a, "\u0001\b\u0001\u0001\u0001\t\b\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ဂ\u0005\u0004ဉ\u0006\u0005ဂ\u0007\u0007ြ\u0000\bြ\u0000\tြ\u0000", new Object[]{"e", "d", "c", aofm.class, aofl.class, "f", "g", "h", aoex.class, aoey.class, aofg.class});
            case NEW_MUTABLE_INSTANCE:
                return new aoff();
            case NEW_BUILDER:
                return new aofe();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aoff.class) {
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

    public boolean k() {
        return (this.c & 64) != 0;
    }
}
