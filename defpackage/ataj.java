package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ataj extends aonm implements aooz {
    public static final ataj a;
    private static volatile aopf e;
    public int b;
    public long c;
    public aony d = emptyProtobufList();

    static {
        ataj atajVar = new ataj();
        a = atajVar;
        aonm.registerDefaultInstance(ataj.class, atajVar);
    }

    private ataj() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b", new Object[]{"b", "c", "d", atai.class});
            case NEW_MUTABLE_INSTANCE:
                return new ataj();
            case NEW_BUILDER:
                return new aone((float[]) null, (boolean[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (ataj.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
