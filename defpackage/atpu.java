package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atpu extends aonm implements aooz {
    public static final atpu a;
    private static volatile aopf n;
    public int b;
    public Object d;
    public atpq f;
    public int l;
    public boolean m;
    public int c = 0;
    private byte o = 2;
    public String e = "";
    public String g = "";
    public String h = "";
    public aony i = aonm.emptyProtobufList();
    public String j = "";
    public aony k = aonm.emptyProtobufList();

    static {
        atpu atpuVar = new atpu();
        a = atpuVar;
        aonm.registerDefaultInstance(atpu.class, atpuVar);
    }

    private atpu() {
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
                return newMessageInfo(a, "\u0001\u000b\u0001\u0001\u0001\u000b\u000b\u0000\u0002\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဵ\u0000\u0004ဈ\u0004\u0005ဈ\u0005\u0006\u001a\u0007ဈ\u0006\b\u001a\tင\u0007\nဇ\b\u000bဵ\u0000", new Object[]{"d", "c", "b", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new atpu();
            case NEW_BUILDER:
                return new aone((int[][]) null, (char[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = n;
                if (aopfVar == null) {
                    synchronized (atpu.class) {
                        aopfVar = n;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            n = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
