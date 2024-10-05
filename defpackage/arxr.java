package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arxr extends aonm implements aooz {
    public static final arxr a;
    private static volatile aopf i;
    public int b;
    public int d;
    public int e;
    public int g;
    public int h;
    public String c = "";
    public aony f = emptyProtobufList();

    static {
        arxr arxrVar = new arxr();
        a = arxrVar;
        aonm.registerDefaultInstance(arxr.class, arxrVar);
    }

    private arxr() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004\u001b\u0005ဋ\u0003\u0006ဋ\u0004", new Object[]{"b", "c", "d", "e", "f", arxt.class, "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new arxr();
            case NEW_BUILDER:
                return new aone((int[][]) null, (int[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (arxr.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
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
