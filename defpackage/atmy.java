package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atmy extends aonm implements aooz {
    private static final atmy a;
    private static volatile aopf b;
    private int c;
    private atnb d;
    private int e;

    static {
        atmy atmyVar = new atmy();
        a = atmyVar;
        aonm.registerDefaultInstance(atmy.class, atmyVar);
    }

    private atmy() {
    }

    public static atmx a() {
        return (atmx) a.createBuilder();
    }

    public static /* synthetic */ void c(atmy atmyVar, atnb atnbVar) {
        atmyVar.f(atnbVar);
    }

    public static /* synthetic */ void d(atmy atmyVar, atna atnaVar) {
        atmyVar.e(atnaVar);
    }

    public void e(atna atnaVar) {
        this.e = atnaVar.r;
        this.c |= 4;
    }

    public void f(atnb atnbVar) {
        this.d = atnbVar;
        this.c |= 1;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဌ\u0002", new Object[]{"c", "d", "e", atna.a()});
            case NEW_MUTABLE_INSTANCE:
                return new atmy();
            case NEW_BUILDER:
                return new atmx();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (atmy.class) {
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
