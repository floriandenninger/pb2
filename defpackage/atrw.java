package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atrw extends aonm implements aooz {
    public static final atrw a;
    private static volatile aopf h;
    public int b;
    public aqyg c;
    public aqyg d;
    public int e;
    public int f;
    public boolean g;
    private byte i = 2;

    static {
        atrw atrwVar = new atrw();
        a = atrwVar;
        aonm.registerDefaultInstance(atrw.class, atrwVar);
    }

    private atrw() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဇ\u0004", new Object[]{"b", "c", "d", "e", atrx.a(), "f", atrv.a(), "g"});
            case NEW_MUTABLE_INSTANCE:
                return new atrw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (atrw.class) {
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
