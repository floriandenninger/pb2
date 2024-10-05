package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class apdy extends aonm implements aooz {
    public static final aonv a = new uct(8);
    public static final aonv b = new uct(9);
    public static final apdy c;
    private static volatile aopf i;
    public boolean d;
    public int e;
    public aonu f = emptyIntList();
    public aonu g = emptyIntList();
    public boolean h;
    private int j;

    static {
        apdy apdyVar = new apdy();
        c = apdyVar;
        aonm.registerDefaultInstance(apdy.class, apdyVar);
    }

    private apdy() {
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
                return newMessageInfo(c, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဇ\u0000\u0002င\u0001\u0003\u001e\u0004\u001e\u0005ဇ\u0002", new Object[]{"j", "d", "e", "f", apdz.a(), "g", apdz.a(), "h"});
            case NEW_MUTABLE_INSTANCE:
                return new apdy();
            case NEW_BUILDER:
                return new aone(c);
            case GET_DEFAULT_INSTANCE:
                return c;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (apdy.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(c);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
