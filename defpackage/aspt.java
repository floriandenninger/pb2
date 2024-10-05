package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aspt extends aonm implements aooz {
    public static final aspt a;
    private static volatile aopf i;
    public int b;
    public Object d;
    public aqyg f;
    public aulq g;
    public apxf h;
    public int c = 0;
    private byte j = 2;
    public String e = "";

    static {
        aspt asptVar = new aspt();
        a = asptVar;
        aonm.registerDefaultInstance(aspt.class, asptVar);
    }

    private aspt() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0005\u0001ဈ\u0000\u0003ᐼ\u0000\u0004ᐼ\u0000\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006", new Object[]{"d", "c", "b", "e", arfs.class, aulq.class, "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new aspt();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (aspt.class) {
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
