package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ascw extends aonm implements aooz {
    public static final ascw a;
    private static volatile aopf h;
    public int b;
    public arnb c;
    public ascs e;
    public ascu f;
    public ascv g;
    private byte i = 2;
    public String d = "";

    static {
        ascw ascwVar = new ascw();
        a = ascwVar;
        aonm.registerDefaultInstance(ascw.class, ascwVar);
    }

    private ascw() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0010\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\tဉ\u0007\fဉ\n\u0010ဉ\u000e", new Object[]{"b", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new ascw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (ascw.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
