package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avef extends aonm implements aooz {
    public static final avef a;
    private static volatile aopf f;
    public int b;
    public aovj c;
    public auup d;
    public avea e;
    private aptj g;
    private auuq h;
    private avko i;
    private aqwh j;
    private byte k = 2;

    static {
        avef avefVar = new avef();
        a = avefVar;
        aonm.registerDefaultInstance(avef.class, avefVar);
    }

    private avef() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\ue9beⓏ﹤냷\u0007\u0000\u0000\u0007\ue9beⓏᐉ\u0000\ue64a⤉ᐉ\u0002履⭎ᐉ\u0001\uf223㙻ᐉ\u0003\ue057䫂ᐉ\u0004\uecd7斿ᐉ\u0005﹤냷ᐉ\u0006", new Object[]{"b", "c", "d", "g", "h", "i", "j", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new avef();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (avef.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
