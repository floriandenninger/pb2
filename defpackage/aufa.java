package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aufa extends aonm implements aooz {
    public static final aufa a;
    private static volatile aopf l;
    public int b;
    public avgg c;
    public aqyg e;
    public aqyg f;
    public aqyg g;
    public apxf i;
    public aulq j;
    private atdf m;
    private aota n;
    private byte o = 2;
    public aony d = emptyProtobufList();
    public aony h = emptyProtobufList();
    public aomf k = aomf.b;

    static {
        aufa aufaVar = new aufa();
        a = aufaVar;
        aonm.registerDefaultInstance(aufa.class, aufaVar);
    }

    private aufa() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.o);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0002\n\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005Л\u0006ᐉ\u0004\u0007ᐉ\u0005\bည\u0007\tᐉ\b\nᐉ\u0001\u000bᐉ\u0006", new Object[]{"b", "c", "d", avfv.class, "f", "g", "h", apkd.class, "i", "m", "k", "n", "e", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new aufa();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (aufa.class) {
                        aopfVar = l;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            l = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
