package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atos extends aonm implements aooz {
    public static final atos a;
    private static volatile aopf g;
    public int b;
    public avgg d;
    public boolean f;
    private aqyg h;
    private byte i = 2;
    public String c = "";
    public String e = "";

    static {
        atos atosVar = new atos();
        a = atosVar;
        aonm.registerDefaultInstance(atos.class, atosVar);
    }

    private atos() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002\u0004ဇ\u0004\u0005ᐉ\u0003", new Object[]{"b", "c", "d", "e", "f", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new atos();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (atos.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
