package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awsw extends aonm implements aooz {
    private static final awsw a;
    private static volatile aopf b;
    private int c;
    private Object e;
    private aoqa f;
    private int d = 0;
    private byte h = 2;
    private String g = "";

    static {
        awsw awswVar = new awsw();
        a = awswVar;
        aonm.registerDefaultInstance(awsw.class, awswVar);
    }

    private awsw() {
    }

    public static awsv a() {
        return (awsv) a.createBuilder();
    }

    public static /* synthetic */ awsw b() {
        return a;
    }

    public static /* synthetic */ void c(awsw awswVar, aoqa aoqaVar) {
        awswVar.p(aoqaVar);
    }

    public static /* synthetic */ void h(awsw awswVar, awsq awsqVar) {
        awswVar.m(awsqVar);
    }

    public void j(awsi awsiVar) {
        awsiVar.getClass();
        this.e = awsiVar;
        this.d = 5;
    }

    public void k(awsk awskVar) {
        awskVar.getClass();
        this.e = awskVar;
        this.d = 4;
    }

    public void l(awsm awsmVar) {
        awsmVar.getClass();
        this.e = awsmVar;
        this.d = 9;
    }

    public void m(awsq awsqVar) {
        awsqVar.getClass();
        this.e = awsqVar;
        this.d = 8;
    }

    public void n(awss awssVar) {
        awssVar.getClass();
        this.e = awssVar;
        this.d = 3;
    }

    public void o(awsu awsuVar) {
        awsuVar.getClass();
        this.e = awsuVar;
        this.d = 2;
    }

    public void p(aoqa aoqaVar) {
        aoqaVar.getClass();
        this.f = aoqaVar;
        this.c |= 1;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0001\u0001\u0001\t\b\u0000\u0000\u0002\u0001ဉ\u0000\u0002ြ\u0000\u0003ᐼ\u0000\u0004ᐼ\u0000\u0005ြ\u0000\u0006ြ\u0000\bြ\u0000\tြ\u0000", new Object[]{"e", "d", "c", "f", awsu.class, awss.class, awsk.class, awsi.class, awso.class, awsq.class, awsm.class});
            case NEW_MUTABLE_INSTANCE:
                return new awsw();
            case NEW_BUILDER:
                return new awsv();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (awsw.class) {
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
}
