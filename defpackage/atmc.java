package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atmc extends aonm implements aooz {
    public static final atmc a;
    private static volatile aopf i;
    public int b;
    public int d;
    public int e;
    public boolean g;
    public awav h;
    public String c = "";
    public String f = "";

    static {
        atmc atmcVar = new atmc();
        a = atmcVar;
        aonm.registerDefaultInstance(atmc.class, atmcVar);
    }

    private atmc() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u000b\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0004င\u0001\u0005င\u0002\u0007ဈ\u0005\tဇ\t\u000bဉ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new atmc();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (atmc.class) {
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
