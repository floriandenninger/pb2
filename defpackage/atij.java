package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atij extends aonm implements aooz {
    public static final atij a;
    private static volatile aopf c;
    public atik b;
    private int d;

    static {
        atij atijVar = new atij();
        a = atijVar;
        aonm.registerDefaultInstance(atij.class, atijVar);
    }

    private atij() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001II\u0001\u0000\u0000\u0000Iဉ\u001c", new Object[]{"d", "b"});
            case NEW_MUTABLE_INSTANCE:
                return new atij();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (atij.class) {
                        aopfVar = c;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            c = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
