package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rll extends aonm implements aooz {
    public static final rll a;
    private static volatile aopf i;
    public int b;
    public int c;
    public aony d = emptyProtobufList();
    public String e = "";
    public String f = "";
    public boolean g;
    public double h;

    static {
        rll rllVar = new rll();
        a = rllVar;
        aonm.registerDefaultInstance(rll.class, rllVar);
    }

    private rll() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"b", "c", dvg.t, "d", rll.class, "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new rll();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (rll.class) {
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
