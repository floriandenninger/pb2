package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sgt extends aonm implements aooz {
    public static final sgt a;
    private static volatile aopf i;
    public int b;
    public int c;
    public sgs e;
    public int g;
    public sgr h;
    public String d = "";
    public String f = "";

    static {
        sgt sgtVar = new sgt();
        a = sgtVar;
        aonm.registerDefaultInstance(sgt.class, sgtVar);
    }

    private sgt() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0003\n\u0006\u0000\u0000\u0000\u0003ဌ\u0000\u0004ဈ\u0001\u0005ဉ\u0002\bဈ\u0004\tင\u0005\nဉ\u0006", new Object[]{"b", "c", sgo.c, "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new sgt();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (sgt.class) {
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
