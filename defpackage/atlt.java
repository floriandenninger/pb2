package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atlt extends aonm implements aooz {
    public static final atlt a;
    private static volatile aopf h;
    public int b;
    public aqyg c;
    public aulq d;
    public aulq e;
    public long f;
    private aota i;
    private byte j = 2;
    public aomf g = aomf.b;

    static {
        atlt atltVar = new atlt();
        a = atltVar;
        aonm.registerDefaultInstance(atlt.class, atltVar);
    }

    private atlt() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဂ\u0003\u0005ᐉ\u0004\u0006ည\u0005", new Object[]{"b", "c", "d", "e", "f", "i", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new atlt();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (atlt.class) {
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
