package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aubr extends aonm implements aooz {
    public static final aubr a;
    private static volatile aopf h;
    public int b;
    public aubw c;
    public aubp d;
    public aubt e;
    public aqrf f;
    public atdn g;
    private avoe i;
    private avpe j;
    private apha k;
    private auax l;
    private auby m;
    private byte n = 2;

    static {
        aubr aubrVar = new aubr();
        a = aubrVar;
        aonm.registerDefaultInstance(aubr.class, aubrVar);
    }

    private aubr() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\uf875ᢰﾭ朰\n\u0000\u0000\n\uf875ᢰᐉ\u0000\ue592᯦ᐉ\t\ue0b9⸫ᐉ\u0003\ue377⹒ᐉ\u0001\ue3c8⹒ᐉ\u0002ﱉ㚈ᐉ\u0004\uecd5䉹ᐉ\u0005\uf492䤳ᐉ\b\ue091抢ᐉ\u0006ﾭ朰ᐉ\u0007", new Object[]{"b", "c", "g", "k", "i", "j", "l", "d", "f", "m", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aubr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aubr.class) {
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
