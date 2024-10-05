package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axey extends aonm implements aooz {
    public static final axey a;
    private static volatile aopf i;
    public int b;
    public Object d;
    public axex f;
    public aqqz g;
    public int c = 0;
    public String e = "";
    public String h = "";

    static {
        axey axeyVar = new axey();
        a = axeyVar;
        aonm.registerDefaultInstance(axey.class, axeyVar);
    }

    private axey() {
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ြ\u0000\u0004ဉ\u0003\u0005ဈ\u0004", new Object[]{"d", "c", "b", "e", "f", avwj.class, "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new axey();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (axey.class) {
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
