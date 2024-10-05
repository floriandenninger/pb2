package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atcw extends aonm implements aooz {
    public static final atcw a;
    private static volatile aopf h;
    public int b;
    public aqyg c;
    public arfs d;
    public apxf e;
    public int g;
    private aota i;
    private byte j = 2;
    public aomf f = aomf.b;

    static {
        atcw atcwVar = new atcw();
        a = atcwVar;
        aonm.registerDefaultInstance(atcw.class, atcwVar);
    }

    private atcw() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ည\u0004\u0007ဌ\u0006", new Object[]{"b", "c", "d", "e", "i", "f", "g", atbk.l});
            case NEW_MUTABLE_INSTANCE:
                return new atcw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (atcw.class) {
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
