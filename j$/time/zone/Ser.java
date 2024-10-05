package j$.time.zone;

import j$.time.ZoneOffset;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import org.chromium.net.PrivateKeyType;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class Ser implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;
    private Object object;
    private byte type;

    public Ser() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Ser(byte b, Object obj) {
        this.type = b;
        this.object = obj;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        writeInternal(this.type, this.object, objectOutput);
    }

    private static void writeInternal(byte b, Object obj, DataOutput dataOutput) {
        dataOutput.writeByte(b);
        if (b == 1) {
            ((ZoneRules) obj).writeExternal(dataOutput);
            return;
        }
        if (b == 2) {
            ((ZoneOffsetTransition) obj).writeExternal(dataOutput);
        } else if (b == 3) {
            ((ZoneOffsetTransitionRule) obj).writeExternal(dataOutput);
        } else {
            if (b == 100) {
                ((ZoneRules) obj).writeExternalTimeZone(dataOutput);
                return;
            }
            throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.type = readByte;
        this.object = readInternal(readByte, objectInput);
    }

    private static Object readInternal(byte b, DataInput dataInput) {
        if (b == 1) {
            return ZoneRules.readExternal(dataInput);
        }
        if (b == 2) {
            return ZoneOffsetTransition.readExternal(dataInput);
        }
        if (b == 3) {
            return ZoneOffsetTransitionRule.readExternal(dataInput);
        }
        if (b == 100) {
            return ZoneRules.readExternalTimeZone(dataInput);
        }
        throw new StreamCorruptedException("Unknown serialized type");
    }

    private Object readResolve() {
        return this.object;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void writeOffset(ZoneOffset zoneOffset, DataOutput dataOutput) {
        int totalSeconds = zoneOffset.getTotalSeconds();
        int i = totalSeconds % 900 == 0 ? totalSeconds / 900 : 127;
        dataOutput.writeByte(i);
        if (i == 127) {
            dataOutput.writeInt(totalSeconds);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZoneOffset readOffset(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? ZoneOffset.ofTotalSeconds(dataInput.readInt()) : ZoneOffset.ofTotalSeconds(readByte * 900);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void writeEpochSec(long j, DataOutput dataOutput) {
        if (j >= -4575744000L && j < 10413792000L && j % 900 == 0) {
            int i = (int) ((j + 4575744000L) / 900);
            dataOutput.writeByte((i >>> 16) & PrivateKeyType.INVALID);
            dataOutput.writeByte((i >>> 8) & PrivateKeyType.INVALID);
            dataOutput.writeByte(i & PrivateKeyType.INVALID);
            return;
        }
        dataOutput.writeByte(PrivateKeyType.INVALID);
        dataOutput.writeLong(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long readEpochSec(DataInput dataInput) {
        if ((dataInput.readByte() & 255) == 255) {
            return dataInput.readLong();
        }
        return ((((r0 << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255)) * 900) - 4575744000L;
    }
}
