package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apux extends aonm implements aooz {
    public static final apux a;
    private static volatile aopf i;
    public int b;
    public apus c;
    public apuw d;
    public int f;
    public aony g;
    public aomf h;
    private aota j;
    private byte k = 2;
    public aony e = emptyProtobufList();

    static {
        apux apuxVar = new apux();
        a = apuxVar;
        aonm.registerDefaultInstance(apux.class, apuxVar);
    }

    private apux() {
        emptyProtobufList();
        this.g = aonm.emptyProtobufList();
        this.h = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0002\u0003\u0001ᐉ\u0001\u0002Л\u0004ဋ\u0002\u0005ᐉ\u0003\u0006ည\u0004\u0007ဉ\u0000\b\u001a", new Object[]{"b", "d", "e", apuz.class, "f", "j", "h", "c", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new apux();
            case NEW_BUILDER:
                return new aone((char[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (apux.class) {
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
