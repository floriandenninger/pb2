package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atpy extends aonm implements aooz {
    public static final atpy a;
    private static volatile aopf i;
    public int b;
    public String c = "";
    public int d;
    public awav e;
    public int f;
    public int g;
    public boolean h;

    static {
        atpy atpyVar = new atpy();
        a = atpyVar;
        aonm.registerDefaultInstance(atpy.class, atpyVar);
    }

    private atpy() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0005ဉ\u0003\u0006င\u0005\u0007င\u0006\tဇ\b", new Object[]{"b", "c", "d", atnn.k, "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new atpy();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (atpy.class) {
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
