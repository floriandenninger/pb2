package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atku extends aonm implements aooz {
    public static final atku a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private aqyg f;
    private apxf g;
    private aqyg h;
    private apxf i;
    private aulq j;
    private atkt k;
    private aota l;
    private aulq m;
    private byte n = 2;

    static {
        atku atkuVar = new atku();
        a = atkuVar;
        aonm.registerDefaultInstance(atku.class, atkuVar);
    }

    private atku() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aomf aomfVar = aomf.b;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u001a\n\u0000\u0000\n\u0001ᐉ\u0000\u0005ᐉ\u000e\u0007ᐉ\u0005\bᐉ\u0006\tᐉ\u0007\nᐉ\b\u000bᐉ\u000b\u0011ᐉ\u0002\u0016ᐉ\u0012\u001aᐉ\t", new Object[]{"c", "d", "l", "f", "g", "h", "i", "k", "e", "m", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new atku();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (atku.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
