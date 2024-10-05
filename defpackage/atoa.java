package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atoa extends aonm implements aooz {
    public static final atoa a;
    private static volatile aopf g;
    public int b;
    public boolean c;
    public boolean d;
    public String e = "";
    public boolean f;

    static {
        atoa atoaVar = new atoa();
        a = atoaVar;
        aonm.registerDefaultInstance(atoa.class, atoaVar);
    }

    private atoa() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\t\u0004\u0000\u0000\u0000\u0002ဇ\u0002\u0007ဇ\u0006\bဈ\u0007\tဇ\b", new Object[]{"b", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new atoa();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (atoa.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
