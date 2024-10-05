package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ataf extends aonm implements aooz {
    private static final ataf a;
    private static volatile aopf b;
    private int c;
    private int d;
    private int e;

    static {
        ataf atafVar = new ataf();
        a = atafVar;
        aonm.registerDefaultInstance(ataf.class, atafVar);
    }

    private ataf() {
    }

    public static atae a() {
        return (atae) a.createBuilder();
    }

    public static /* synthetic */ void c(ataf atafVar, atbg atbgVar) {
        atafVar.f(atbgVar);
    }

    public static /* synthetic */ void d(ataf atafVar, atbf atbfVar) {
        atafVar.e(atbfVar);
    }

    public void e(atbf atbfVar) {
        this.e = atbfVar.j;
        this.c |= 2;
    }

    public void f(atbg atbgVar) {
        this.d = atbgVar.d;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"c", "d", atbg.a(), "e", atbf.a()});
            case NEW_MUTABLE_INSTANCE:
                return new ataf();
            case NEW_BUILDER:
                return new atae();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (ataf.class) {
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
