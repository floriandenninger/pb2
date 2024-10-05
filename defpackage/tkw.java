package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tkw extends aonm implements aooz {
    public static final tkw a;
    private static volatile aopf h;
    public int b;
    public int d;
    public int f;
    public tks g;
    public String c = "";
    public String e = "";

    static {
        tkw tkwVar = new tkw();
        a = tkwVar;
        aonm.registerDefaultInstance(tkw.class, tkwVar);
    }

    private tkw() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0005ဌ\u0003\u0006ဉ\u0004", new Object[]{"b", "c", "d", "e", "f", sgo.o, "g"});
            case NEW_MUTABLE_INSTANCE:
                return new tkw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (tkw.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
