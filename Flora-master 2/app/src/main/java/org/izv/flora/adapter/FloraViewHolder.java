package org.izv.flora.adapter;

import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.izv.flora.EditFloraActivity;
import org.izv.flora.R;
import org.izv.flora.model.entity.Flora;

public class FloraViewHolder extends RecyclerView.ViewHolder {

    public Flora flora;
    public TextView tvIdentificacionFlora, tvNombreFlora, tvFamiliaFlora;

    public FloraViewHolder(@NonNull View itemView) {
        super(itemView);
        tvIdentificacionFlora = itemView.findViewById(R.id.tvIdentificacionFlora);
        tvNombreFlora = itemView.findViewById(R.id.tvNombreFlora);
        tvFamiliaFlora = itemView.findViewById(R.id.tvFamiliaFlora);

        itemView.setOnClickListener(v -> {
            Intent intent = new Intent(itemView.getContext(), EditFloraActivity.class);
            intent.putExtra("flora", flora);
            itemView.getContext().startActivity(intent);
        });
    }

}
