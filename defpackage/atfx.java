package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atfx extends aonm implements aooz {
    public static final atfx a;
    private static volatile aopf m;
    public int b;
    public aqyg c;
    public aqyg d;
    public aqyg e;
    public arfs f;
    public boolean g;
    public apxf h;
    public apxf i;
    public long k;
    public long l;
    private atfy n;
    private byte o = 2;
    public aony j = emptyProtobufList();

    static {
        atfx atfxVar = new atfx();
        a = atfxVar;
        aonm.registerDefaultInstance(atfx.class, atfxVar);
    }

    private atfx() {
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ဇ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u0007\t\u001b\u000bဃ\n\fဃ\u000b\rᐉ\u0002", new Object[]{"b", "c", "d", "f", "g", "h", "i", "n", "j", atgl.class, "k", "l", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new atfx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (atfx.class) {
                        aopfVar = m;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            m = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
