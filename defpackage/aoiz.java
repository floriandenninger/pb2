package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoiz extends aonm implements aooz {
    public static final aoiz a;
    private static volatile aopf i;
    public int b;
    public String c = "";
    public aoju d;
    public long e;
    public aojr f;
    public int g;
    public aoko h;

    static {
        aoiz aoizVar = new aoiz();
        a = aoizVar;
        aonm.registerDefaultInstance(aoiz.class, aoizVar);
    }

    private aoiz() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0005ဂ\u0002\u0007ဉ\u0001\bဉ\u0004\tဌ\u0005\nဉ\u0006", new Object[]{"b", "c", "e", "d", "f", "g", aokf.b(), "h"});
            case NEW_MUTABLE_INSTANCE:
                return new aoiz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (aoiz.class) {
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
