package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anee extends aonm implements aooz {
    public static final anee a;
    private static volatile aopf i;
    public int b;
    public andw c;
    public int d;
    public long e;
    public long f;
    public String g = "";
    public int h;

    static {
        anee aneeVar = new anee();
        a = aneeVar;
        aonm.registerDefaultInstance(anee.class, aneeVar);
    }

    private anee() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006င\u0005", new Object[]{"b", "c", "d", ancx.e, "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new anee();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (anee.class) {
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
