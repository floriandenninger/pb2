package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atdu extends aonm implements aooz {
    public static final atdu a;
    private static volatile aopf h;
    public int b;
    public arfs c;
    public int d;
    public aots g;
    private aota i;
    private byte j = 2;
    public String e = "";
    public aomf f = aomf.b;

    static {
        atdu atduVar = new atdu();
        a = atduVar;
        aonm.registerDefaultInstance(atdu.class, atduVar);
    }

    private atdu() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဌ\u0002\u0003ဈ\u0003\u0005ᐉ\u0005\u0006ည\u0006\u0007ဉ\u0007", new Object[]{"b", "c", "d", atbk.n, "e", "i", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new atdu();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (atdu.class) {
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
